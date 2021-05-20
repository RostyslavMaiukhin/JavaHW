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

        Vector3d[] param = new Vector3d[4];
        param[0] = vectorMulti;
        param[1] = vectorSum;
        param[2] = vectorSub;
        param[3] = vector3d;
        for (Vector3d sendParam : param) {
            System.out.print(sendParam.x + " " + sendParam.y + " " + sendParam.z);
            System.out.println();
        }

        System.out.println(Arrays.deepToString((vector3d.randomVector(5))));
    }
}
