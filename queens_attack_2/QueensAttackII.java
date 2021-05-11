package queens_attack_2;

import java.util.ArrayList;

class Solution
{
    public static void main(String[] args)
    {

        ArrayList<ArrayList<Integer>> engeller = new ArrayList<ArrayList<Integer>>();

        System.out.println("Sonuc : " + queensAttack(5, 1, 3, 3, engeller));
        
        
    }


    public static int queensAttack(int n, int k, int r_q, int c_q, ArrayList<ArrayList<Integer>> obstacles) 
    {
    // Write your code here
    int atakBolgeSayisi = 0;
    
    //engeller 1
    //bosluklar 0
    int[][] satrancTahta = new int[n][n];
    
    for(int i = 0; i < obstacles.size(); i++)
    {
        for(int j = 0; j < obstacles.get(i).size(); j++)
        {
            satrancTahta[i][j] = obstacles.get(i).get(j);
        }
    }
    
    
    
    
    
    return atakBolgeSayisi;
    }
}