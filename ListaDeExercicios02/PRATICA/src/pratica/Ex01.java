package pratica;

public class Ex01 {

    public static void main(String[] args) {

        int A[] = {7, 2, 5, 8, 4};
        int B[] = {4, 2, 9, 5};
        String resposta = Intersecao(A, B);
        System.out.println(resposta);

    }

    public static String Intersecao(int a[], int b[]) {
        String c = "";
        for (int i = 0; i < a.length; i++) {
            boolean x = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    x = true;
                    break;
                }
            }
            if(!x){
                c += a[i] + " ";
            }
        }
        return c;
    }

}
