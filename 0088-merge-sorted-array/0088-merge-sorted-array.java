
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left[] = new int[m];
        int right[] = new int[n];

        for (int i = 0; i < m; i++)
            left[i] = nums1[i];

        for (int i = 0; i < n; i++)
            right[i] = nums2[i];

        int final1[] = fun(left, right);

        for (int i = 0; i < m + n; i++)
            nums1[i] = final1[i];
    }

    static int[] fun(int a[], int b[]) {
        int i = 0, j = 0, k = 0;
        int c[] = new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            if (a[i] < b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }

        while (i < a.length)
            c[k++] = a[i++];

        while (j < b.length)
            c[k++] = b[j++];

        return c;
    }
}
