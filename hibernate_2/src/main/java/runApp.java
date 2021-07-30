import dao.*;
import entity.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class runApp {
    public static void main(String[] args) {
        final TrackDao trackDao = new TrackDao();
        final AlbumDao albumDao = new AlbumDao();
        final ArtistDao artistDao = new ArtistDao();
        final CustomerDao customerDao = new CustomerDao();
        final OrderedDao orderDao = new OrderedDao();

        //Create Track
        for (int i = 0; i <= 30; i++) {
            String tittle = generateRandomWords(6);
            trackDao.createTrack(new Track(tittle + "№" + (i + 1)));
        }

        //Create Album
        List<Track> tracks = trackDao.listAll();
        Album album1 = new Album("Розовый вечер");
        album1.setTracks(tracks.subList(0, 9));
        albumDao.createAlbum(album1);

        Album album2 = new Album("The Heretic Anthem");
        album2.setTracks(tracks.subList(10, 19));
        albumDao.createAlbum(album2);

        Album album3 = new Album("Самба белого мотылька");
        album3.setTracks(tracks.subList(20, 30));
        albumDao.createAlbum(album3);

        //ArtistLink
        Artist artist1 = new Artist("Шофутинский");
        artistDao.createArtist(artist1);
        Artist artist2 = new Artist("Миладзе");
        artistDao.createArtist(artist2);
        Artist artist3 = new Artist("Тимофеевский");
        artistDao.createArtist(artist3);

        album1 = albumDao.albumById(1);
        album1.setArtists(Collections.singletonList(artist1));
        album2 = albumDao.albumById(2);
        album2.setArtists(Arrays.asList(artist2, artist3));
        album3 = albumDao.albumById(3);
        album3.setArtists(Collections.singletonList(artist3));

        artist1.setAlbums(Collections.singletonList(album1));
        albumDao.updateAlbum(album1);
        artistDao.updateArtist(artist1);
        artist2.setAlbums(Arrays.asList(album2, album3));
        albumDao.updateAlbum(album2);
        artistDao.updateArtist(artist2);
        artist3.setAlbums(Collections.singletonList(album3));
        albumDao.updateAlbum(album3);
        artistDao.updateArtist(artist3);

        //Create Customer
        Customer customer1 = new Customer("Sony");
        customerDao.createCustomer(customer1);
        Customer customer2 = new Customer("BlackStar");
        customerDao.createCustomer(customer2);
        Customer customer3 = new Customer("Союз-Мультфильм");
        customerDao.createCustomer(customer3);


        //OrdersLink
        album1 = albumDao.albumById(1);
        album2 = albumDao.albumById(2);
        album3 = albumDao.albumById(3);

        Track track1 = trackDao.trackById(getRandomNumberUsingNextInt(0, 30));
        Track track2 = trackDao.trackById(getRandomNumberUsingNextInt(0, 30));
        Track track3 = trackDao.trackById(getRandomNumberUsingNextInt(0, 30));

        Ordered order1 = new Ordered(3, Collections.singletonList(album1), Collections.singletonList(track3));
        orderDao.createOrder(order1);
        Ordered order2 = new Ordered(2, Arrays.asList(album2, album3), Arrays.asList(track1, track2, track3));
        orderDao.createOrder(order2);
        Ordered order3 = new Ordered(1, Collections.singletonList(album3), Collections.singletonList(track3));
        orderDao.createOrder(order3);
    }

    public static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public static String generateRandomWords(int numberOfWords) {
        String randomStrings = "";
        Random random = new Random();
        for (int i = 0; i < numberOfWords; i++) {
            char[] word = new char[random.nextInt(8) + 3];
            for (int j = 0; j < word.length; j++) {
                word[j] = (char) ('a' + random.nextInt(26));
            }
            randomStrings = new String(word);
        }
        return randomStrings;
    }
}