package autox.elements;

public class Battery {
    int[]batteriesUsage = {1,1,1,1,1,1,1,1,};
    public void loadP3(){
        System.out.println("Loading Battery with 3 Poles");

    }
    public void usage(int consumption){
        while(consumption>0){
            for(int j=0;j<batteriesUsage.length;j++){
                if(batteriesUsage[j]==1){
                    consumption-=1;
                    batteriesUsage[j]=0;
                }

            }
            if(consumption>0){
                System.out.println("Batterie leer");
            }
        }
    }


}
