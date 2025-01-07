package day6;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11660 {

    @Test
    public void test() {
        int[][] test = new int[10][10];
        test[1][1] = 10;
        test[2][2] = 10;
        test[3][3] = 10;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(test[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] q = reader.readLine().split(" ");

        StringTokenizer st;
        int size = Integer.parseInt(q[0]);
        int questionCounts = Integer.parseInt(q[1]);

        int[][] square = new int[size + 1][size + 1];
        for (int i = 1; i < size + 1; i++) {
            st = new StringTokenizer(reader.readLine());
            for (int j = 1; j < size + 1; j++) {
                square[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] prefixSum = new int[size + 1][size + 1];
        for (int x = 1; x < size + 1; x++) {
            for (int y = 1; y < size + 1; y++) {
                prefixSum[x][y] = prefixSum[x-1][y] + prefixSum[x][y-1] - prefixSum[x-1][y-1] + square[x][y];
            }
        }

        for (int i = 0; i < questionCounts; i++) {
            st = new StringTokenizer(reader.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            System.out.println(prefixSum[x2][y2] - prefixSum[x2][y1-1] - prefixSum[x1-1][y2] + prefixSum[x1-1][y1-1]);
        }
    }
}
