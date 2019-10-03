import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {

        boolean ret = true;

        a = a.toLowerCase();

        b = b.toLowerCase();

        int c = a.length();

        int d = b.length();

        if (c == d)

        {

            char[] arr1 = new char[c];

            char[] arr2 = new char[d];

            for (int i = 0; i < c; i++)

            {

                // Arrays.sort(arr1);

                // Arrays.sort(arr2);

                for (int j = 0; j < c; j++)

                {

                    for (int k = i + 1; k < c; k++)

                    {

                        if (arr1[i] > arr1[k])

                        {

                            char tmp;

                            tmp = arr1[i];

                            arr1[i] = arr1[j];

                            arr1[j] = tmp;

                        }

                    }

                }

                for (int l = 0; l < c; l++)

                {

                    for (int m = l + 1; m < c; m++)

                    {

                        if (arr2[l] > arr2[m])

                        {

                            char tmp;

                            tmp = arr2[l];

                            arr2[l] = arr2[m];

                            arr2[m] = tmp;

                        }

                    }

                }

                if (arr1[i] == arr2[i])

                {

                    ret = true;

                }

                else

                {

                    ret = false;

                }

            }

        }

        else

        {

            ret = false;

        }

        return ret;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String a = scan.next();

        String b = scan.next();

        scan.close();

        boolean ret = isAnagram(a, b);

        System.out.println((ret) ? "Anagrams" : "Not Anagrams");

    }

}