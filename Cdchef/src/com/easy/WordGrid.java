package com.easy;
import java.io.*;
import java.util.*;



public class WordGrid
{
    static IO io = new IO(System.in);
    static int n;
    static TreeSet<String> words;
    static char[][] grid;
    static String ans;
    static final String fail = "grid\n" + "snot\n" + "poss\n" + "ible\n";

    public static void main(String[] args) throws Exception
    {
        int i, j, k;
        for (int tc = io.nextInt(); tc > 0; --tc)
        {
            words = new TreeSet<>();
            n = io.nextInt();
            for(i = 0; i < n; ++i)
            {
                StringBuilder sb = new StringBuilder(io.next());
                words.add(sb.toString());
                words.add(sb.reverse().toString());
            }

            grid = new char[4][4];

            ans = null;
            if(words.size() > 16)
                io.println(fail);
            else
            {
                recurse(words.higher(""));
                io.println(ans == null ? fail : ans);
            }
        }
        io.flush();
    }

    static void recurse(String word)
    {
        if(word == null)
        {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 4; ++i)
            {
                for (int j = 0; j < 4; ++j)
                    sb.append(grid[i][j] == '\0' ? "A" : grid[i][j]);
                sb.append("\n");
            }
            String potential = sb.toString();
            if(ans == null || ans.compareTo(potential) > 0)
                ans = potential;
            return;
        }
        String rev = new StringBuilder(word).reverse().toString();
        words.remove(word);
        words.remove(rev);

        if(contains(word))
            recurse(words.higher(""));
        else
        {
            int i, j;
            char[] rem = new char[4];

            for(i = 0; i < 4; ++i)
                if(canPlugRowwise(word, i))
                {
                    for (j = 0; j < 4; ++j)
                    {
                        rem[j] = grid[i][j];
                        grid[i][j] = word.charAt(j);
                    }
                    recurse(words.higher(""));
                    for(j = 0; j < 4; ++j)
                        grid[i][j] = rem[j];
                }

            for(j = 0; j < 4; ++j)
                if(canPlugColwise(word, j))
                {
                    for(i = 0; i < 4; ++i)
                    {
                        rem[i] = grid[i][j];
                        grid[i][j] = word.charAt(i);
                    }
                    recurse(words.higher(""));
                    for(i = 0; i < 4; ++i)
                        grid[i][j] = rem[i];
                }

            for(i = 0; i < 4; ++i)
                if(canPlugRowwise(rev, i))
                {
                    for (j = 0; j < 4; ++j)
                    {
                        rem[j] = grid[i][j];
                        grid[i][j] = rev.charAt(j);
                    }
                    recurse(words.higher(""));
                    for(j = 0; j < 4; ++j)
                        grid[i][j] = rem[j];
                }

            for(j = 0; j < 4; ++j)
                if(canPlugColwise(rev, j))
                {
                    for(i = 0; i < 4; ++i)
                    {
                        rem[i] = grid[i][j];
                        grid[i][j] = rev.charAt(i);
                    }
                    recurse(words.higher(""));
                    for(i = 0; i < 4; ++i)
                        grid[i][j] = rem[i];
                }
        }

        words.add(word);
        words.add(rev);
    }

    static boolean canPlugRowwise(String word, int i)
    {
        int j;
        for(j = 0; j < 4 && (grid[i][j] == '\0' || word.charAt(j) == grid[i][j]); ++j);
        return j >= 4;
    }
    static boolean canPlugColwise(String word, int i)
    {
        int j;
        for(j = 0; j < 4 && (grid[j][i] == '\0' || word.charAt(j) == grid[j][i]); ++j);
        return j >= 4;
    }

    static boolean contains(String word)
    {
        String rev = new StringBuilder(word).reverse().toString();
        int i, j;
        for(i = 0; i < 4; ++i)
        {
            StringBuilder s1 = new StringBuilder();
            StringBuilder s2 = new StringBuilder();
            for(j = 0; j < 4; ++j)
            {
                s1.append(grid[i][j]);
                s2.append(grid[j][i]);
            }
            if(s1.toString().equals(word) || s2.toString().equals(word) ||
                    s1.toString().equals(rev) || s2.toString().equals(rev))
                return true;
        }
        return false;
    }
}

class IO
{
    static byte[] buf = new byte[2048];
    static int index, total;
    static InputStream in;
    static StringBuilder sb = new StringBuilder();


    IO(InputStream is)
    {
        in = is;
    }

    int scan() throws Exception
    {
        if (index >= total)
        {
            index = 0;
            total = in.read(buf);
            if (total <= 0)
                return -1;
        }
        return buf[index++];
    }

    String next() throws Exception
    {
        int c;
        for (c = scan(); c <= 32; c = scan()) ;
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = scan())
            sb.append((char) c);
        return sb.toString();
    }

    int nextInt() throws Exception
    {
        int c, val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+')
            c = scan();
        for (; c >= '0' && c <= '9'; c = scan())
            val = (val << 3) + (val << 1) + (c & 15);
        return neg ? -val : val;
    }

    long nextLong() throws Exception
    {
        int c;
        long val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+')
            c = scan();
        for (; c >= '0' && c <= '9'; c = scan())
            val = (val << 3) + (val << 1) + (c & 15);
        return neg ? -val : val;
    }

    void print(Object a)
    {
        sb.append(a.toString());
    }

    void println(Object a)
    {
        sb.append(a.toString()).append("\n");
    }

    void println()
    {
        sb.append("\n");
    }

    void flush()
    {
        System.out.print(sb);
        sb = new StringBuilder();
    }
}