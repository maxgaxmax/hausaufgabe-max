import java.util.Arrays; //Braucht man vermutlich nicht

public class VIPNumbers {
    public static void main (String [] args) {
        
        String komma = "";
        String[] Array = {"0211/1357", "0201/963421", "0211/6300553", "0203/3002020","0201/23465211", "0211/6433555", "0203/0211031", "0211/11223344", "0211/1230321", "0211/2843261"};      //Hier stehen die zu überprüfenden Telefonnummern 
        System.out.print("These are the VIP phone numbers:");                       //Dieser Text soll vor den VIP-Telefonnummern stehen
        
        for (int positionImArray = 0; positionImArray < 10; positionImArray++){     //for-Schleife um die entsprechende Zahl im Array zu benutzten
            
            int laenge = Array[positionImArray].substring(5).length();              //Hier wird geschaut, wie lang die Telefonnummer ohne Vorwahl ist
            boolean stop = false;

            for (int a = 0; a < laenge - 1; a++){                                   //Diese for-Schleife laeuft für jede Ziffer einmal durch 
              
                if (!stop){                                                         //Nummer wird nicht noch weiter überprüft, wenn es sich um eine VIP-Nummer handelt
                    
                    for (int i = 0; i < (laenge - a) / 2; i++) {                                                                                //In dieser Gesamten for-Schleife
                                                                                                                                                //wird abgefragt wie lang die in
                        String newNum = Array[positionImArray].substring(5).substring(a, i + a + 1);                                            //der Telefonnummer enthaltenen
                        int num = Integer.parseInt(newNum);                                                                                     //Zahlen lang seien dürfen und
                        String recurrentNum =  newNum + newNum;                                                                                 //es wird die für die Aufgaben-
                        num++;                                                                                                                  //stellung nötige Rechnung
                        newNum = newNum + Integer.toString(num);                                                                                //ausgeführt.
                                                                                                                                                
                        if (Array[positionImArray].substring(5).contains(newNum) || Array[positionImArray].substring(5).contains(recurrentNum)){//prüft ob es sich um eine VIP-Telefonnummer handelt
                                
                            System.out.print(komma + " " + Array[positionImArray]); //Gibt die Vip-Telefonnummern aus
                            komma = ",";
                            stop = true;
                        }
                    }
                }
            }
        }
    }
}
