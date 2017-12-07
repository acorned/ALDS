package recursive;

/* Matrix has to be int[][] where 0 is free to go, 1 is a barrier.
* After executing 2 is the way of robot.
* It took about an hour.
*/
public class Task02 {

    public int[][] m;

    public boolean findWay(int r, int c) {
        int length = m[0].length;
        int height = m.length;

        if ((r == 2 && c == 1) || (r == 1 && c == 2)) {
            if (m[height - 1][length - 1] == 0 &&
                    m[height - r][length - c] == 0) {

                m[height - 1][length - 1] = 2;
                m[height - r][length - c] = 2;
                return true;
            } else return false;
        }

        if (r > 1 && m[height - r + 1][length - c] == 0 && findWay(r - 1, c)) {
            m[height - r + 1][length - c] = 2;
            return true;
        }

        if (c > 1 && m[height - r][length - c + 1] == 0 && findWay(r, c - 1)) {
            m[height - r][length - c + 1] = 2;
            return true;
        }
        return false;
    }

}

