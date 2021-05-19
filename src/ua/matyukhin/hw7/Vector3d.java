package ua.matyukhin.hw7;

import java.util.Random;

public class Vector3d {
    int x;
    int y;
    int z;

    Vector3d(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double vectorLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3d vectorMulti(Vector3d vec) {
        int x1 = y * vec.z - z * vec.y;
        int y1 = z * vec.x - x * vec.z;
        int z1 = x * vec.y - y * vec.x;
        return new Vector3d(x1, y1, z1);
    }

    public double vectorCos(Vector3d vec) {
        double vectorsMiddleLength = Math.sqrt((x * x + y * y + z * z) * (vec.x * vec.x + vec.y * vec.y + vec.z * vec.z));
        return (x * vec.x + y * vec.y + z * vec.z) / vectorsMiddleLength;
    }

    public Vector3d vectorSum(Vector3d vec) {
        int x2 = x + vec.x;
        int y2 = y + vec.y;
        int z2 = z + vec.z;
        return new Vector3d(x2, y2, z2);
    }

    public Vector3d vectorSub(Vector3d vec) {
        int x2 = x - vec.x;
        int y2 = y - vec.y;
        int z2 = z - vec.z;
        return new Vector3d(x2, y2, z2);
    }

    public int[][] randomVector(int n) {
        Random random = new Random();
        int[][] randomVec = new int[n][3];
        for (int i = 0; i < randomVec.length; i++) {
            for (int j = 0; j < randomVec[i].length; j++) {
                randomVec[i][j] = random.nextInt(10);
            }
        }
        return randomVec;
    }

    public void describeYourself(Vector3d vec) {
        System.out.print(vec.x + " " + vec.y + " " + vec.z);
        System.out.println();
    }

}
