
package clases;

import java.util.Arrays;

public class tanque extends Variables{

    public tanque(float radiotub, float radiotq, float alturatq, float v_agua, float voltq, float caudal) {
        super(radiotub, radiotq, alturatq, v_agua, voltq, caudal);
    }
    
    public int[] tiempo() { //clase array para calculo del tiempo
        
        int temp,s;
        int[] ttotal = new int[3]; //lista que almacenará la hora, minutos, segundos (en ese orden)
        
        System.out.println("flag1");
        
        voltq = (float) (alturatq*(Math.PI*Math.pow(radiotq,2))) ;
        caudal = (float) (v_agua*(Math.PI*Math.pow(radiotub,2)));        
        
        float t=voltq/caudal ; // se calcula el tiempo
        System.out.println(voltq);
        
        if (t>60){       
            int min = (int)t/(60); //halla los minutos   
            System.out.println(min);        
            if (min>60){ //si excede los 60 min comienza a calcular las horas
                int hora = (int)min/(60); //calculo de las horas
                temp = hora*3600; //variable temporal para calcular los minutos que sobran
                int temp_s=(int) t - temp; //tiempo que sobra en segundos
                min=temp_s/60; //calculo de los minutos exactos
                temp=min*60; //temporal para calcular los segundos
                s=temp_s - temp; //el tiempo sobrante serán los sengudos                                 
                //arreglamos los datos en la lista "ttotal" para imprimir el tiempo
                ttotal[0]= hora ;
                ttotal[1]= min;
                ttotal[2]= s;      
                System.out.println("flag horas");
                System.out.println(Arrays.toString(ttotal));     }
            else{ //si no excede los 60 min
                int mins = min ;
                temp=mins*60; //temporal para calcular los segundos que sobran
                s=(int)t-temp; //segundos
                //arreglamos los datos en la lista "ttotal" para imprimir el tiempo
                ttotal[0]= 0 ;
                ttotal[1]= mins;
                ttotal[2]= s;
                System.out.println("flag mins");
                System.out.println(Arrays.toString(ttotal));}
        } else {        
            ttotal[0]= 0 ;
            ttotal[1]= 0 ;
            ttotal[2]= (int) t ; }
        
        return ttotal;
    }
}

   