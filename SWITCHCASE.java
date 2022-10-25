import java.util.Scanner;

public class SWITCHCASE { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入行");
        int n = sc.nextInt();
        System.out.println("請輸入愛心");
        int m = sc.nextInt(); 
        for (int a = 0; a < n; a++) {
            for (int i = 2; i >= 1; i--) { //一開始的空格
                for (int p = 0; p < m; p++) {
                    for(int choice=1;choice<=5;choice++){
                    switch(choice){
                        case 1,5:
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" ");
                        }break;
                        case 2,4:
                        for (int k = 9 - (i * 2); k >= 1; k--) {
                            System.out.print("*");
                        }break;
                        case 3:
                        for (int j = 1; j <= (i*2)-1; j++) {
                            System.out.print(" ");
                        }break;
                    }
                }
                    System.out.print("  ");
                }
                System.out.println();
            }
            for (int i = 0; i <= 4; i++) {
                for (int p = 0; p < m; p++) {
                    for(int choice=1;choice<=3;choice++){
                        switch(choice){
                            case 1,3:
                            for (int j = 1; j <= i; j++) {
                                System.out.print("  ");
                            }break;
                            case 2:
                            for (int k = 17 - (i * 4); k >= 1; k--)
                            {
                            System.out.print("*");
                            }break;
                        }
                    }
                    System.out.print("  ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}