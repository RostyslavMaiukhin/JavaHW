package ua.matyukhin.hw7.Task3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Vector3d vector3d = new Vector3d(1, 2, 3);
        System.out.println(vector3d.vectorLength());
        System.out.println(vector3d.vectorCos(new Vector3d(4, 5, 6)));
        Vector3d vectorMulti = vector3d.vectorMulti(new Vector3d(4, 5, 6));
        Vector3d vectorSum = vector3d.vectorSum(new Vector3d(4, 5, 6));
        Vector3d vectorSub = vector3d.vectorSub(new Vector3d(4, 5, 6));

        Vector3d[] methods = new Vector3d[4];
        methods[0] = vectorMulti;
        methods[1] = vectorSum;
        methods[2] = vectorSub;
        methods[3] = vector3d;
        for (Vector3d vector : methods) {
            System.out.print(vector.x + " " + vector.y + " " + vector.z);
            System.out.println();
        }

        System.out.println(Arrays.deepToString((Vector3d.randomVector(6))));
    }
}
