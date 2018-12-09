package tugasthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Asep Qulyubi A S
 */
public class Tugasthread {
   public String angka;

public void setName(String newName){
  angka = newName;
}
public String getName(){
return angka;
}

 
     
public static void main(String[] args){
ExecutorService service = Executors.newFixedThreadPool(6);

for (int i=0; i<5; i++){
service.submit(new prosesor(i));
Tugasthread testangka=new Tugasthread();
testangka.setName(" adalah bilangan ganjil");
for (int angka = 1; angka <100; angka=angka+2){
  System.out.println(angka+testangka.getName());
}

try{

service.awaitTermination(1,TimeUnit.DAYS);

}catch(InterruptedException e) {
  e.printStackTrace();
}
System.out.println("semua Task telah selesai");
}

}
}