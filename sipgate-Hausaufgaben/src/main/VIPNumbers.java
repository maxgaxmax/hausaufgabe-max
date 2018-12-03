import java.util.Arrays; //Braucht man vermutlich nicht

public class VIPNumbers {
    public static void main (String [] args) {
        
        int startNum;
        String comma = "";
        String[] Array = {"0211/6355550", "0201/963421", "0211/6300553", "0203/3002020","0201/23465211", "0211/6433555", "0203/0211031", "0211/11223344", "0211/1230321", "0211/2843261"};
        System.out.print("These are the VIP phone numbers:");
        
        for (int o = 0; o < 10; o++){
            
            int length = Array[o].substring(5).length();
            boolean stop = false;
            
            for (int a = 0; a < length - 1; a++){
              
                int k = 1;
                if (stop == false){
                    for (int i = 0; i < (length - a) / 2; i++) {
                        if (stop == false){
                            String newNum = Array[o].substring(5).substring(a, i + a + 1);
                            int num = Integer.parseInt(newNum);
                            startNum = num;
                            String recurrentNum =  newNum + newNum;
                            num++;
                            newNum = newNum + Integer.toString(num);

                            if (Array[o].substring(5).contains(newNum) || Array[o].substring(5).contains(recurrentNum)){
                                
                                System.out.print(comma + " " + Array[o]);
                                comma = ",";
                                stop = true;
                            }
                        }
                    }
                }
            }
        }
    }
}
