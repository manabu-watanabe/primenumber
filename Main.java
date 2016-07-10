// 素数判定
public class Main {
    public static void main(String[] args) throws Exception {

        Main a = new Main();
        
        int cnt = 0;
        for (int i = 0; i < 1000; i++) {
            
            if (a.cheackNum(i)) {
                System.out.print("" + i + ", " );
                cnt++;
            }
        }
        System.out.println("");
        System.out.println("素数の数は" + cnt);
    }
    
    
    public boolean cheackNum(int num) {
        
        // 2未満は素数以外
        if (num < 2) {
            return false;
        }
        
        // 2の場合は、素数
        if (num == 2) {
            return true;
        }
        
        // 2で割り切れた場合は、素数以外
        if (num % 2 == 0) {
            return false;
        }
        
        // 3以上でチェックする
        for (int i = 3; i <= (num / i); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
