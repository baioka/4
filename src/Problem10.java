import java.util.Arrays;

public class Problem10 {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[][] dist = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
            dist[i][i] = 0;
        }

        for (int[] edge : times) {
            dist[edge[0]][edge[1]] = edge[2];
        }

        for (int edge = 1; edge <= n; edge++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (dist[i][edge] != Integer.MAX_VALUE && dist[edge][j] != Integer.MAX_VALUE) {
                        if (dist[i][edge] + dist[edge][j] < dist[i][j]) {
                            dist[i][j] = dist[i][edge] + dist[edge][j];
                        }
                    }
                }
            }
        }

        int maxDelay = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[k][i] == Integer.MAX_VALUE) return -1;
            maxDelay = Math.max(maxDelay, dist[k][i]);
        }
        return maxDelay;
    }
}
