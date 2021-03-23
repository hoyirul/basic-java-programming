/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number2;

/**
 *
 * @author irulg
 */
public class PremierLeagueService {
    public PremierLeague[] leagues = new PremierLeague[20];
    public int ctx;
    
    void tambah(PremierLeague m){
        if(ctx < leagues.length){
            leagues[ctx] = m;
            ctx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    
    void tampilAll(){
        for(PremierLeague m : leagues){
            System.out.println(m.team + "  " + m.play + "  " + m.goal + "  " + m.points);
        }
    }
    
    void insertionSort(boolean asc){
        for(int i=1;i<leagues.length;i++){
            PremierLeague temp = leagues[i];
            int j = i;
            if(asc == true){                   
                while(j > 0 && leagues[j].points > temp.points){
                    leagues[j] = leagues[j-1];
                    j--;
                } 
            }else{
                while(j > 0 && leagues[j-1].points < temp.points){
                    leagues[j] = leagues[j-1];
                    j--;
                } 
            }
            leagues[j] = temp;
        }
    }
}
