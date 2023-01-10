import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
       FastReader fr = new FastReader(); // 문제 해결 소스 코드
       int C = fr.nextInt();		
       ArrayList <Integer> score = new ArrayList<>(); // 점수를 입력받을 score arrayList
       
       for(int i=0;i<C;i++) {
    	   int pop = fr.nextInt();	double sum = 0;
    	   for(int j=0;j<pop;j++) {
    		   
    		   score.add(fr.nextInt());			// 점수 입력 완료
    		   sum += score.get(j);
    	   }
    	   double avg = 0;
    	   avg = (sum / pop);	double count = 0;
    	   
    	   for(int k=0;k<score.size();k++) {
    		   if(score.get(k) > avg)
    			  count ++;
    	   }
    	   
    	   System.out.println((count/pop)*100 + "%");
       }
    }
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        public FastReader(String s) throws FileNotFoundException { br = new BufferedReader(new FileReader(new File(s))); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}