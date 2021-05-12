package queens_attack_2;

import java.util.ArrayList;

class Solution
{
    public static void main(String[] args)
    {

        int n = 5;
        int k = 3;
        int vezirYatay = 3;
        int vezirDikey = 4;

        ArrayList<ArrayList<Integer>> engeller = new ArrayList<ArrayList<Integer>>();

        int[][] engel_list = {
            {5, 5},
            {4, 2},
            {2, 3}
        };

        for (int i = 0; i < engeller.size(); i++) {
            for (int j = 0; j < engeller.get(i).size(); j++) {
                //engeller.get(i).get(j). = engel_list[i][j];
            }
        }
        


        System.out.println("Sonuc : " + queensAttack(n, k, vezirYatay, vezirDikey, engeller));
        
        
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