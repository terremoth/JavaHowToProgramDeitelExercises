/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;

/**
 *
 * @author Lucas Marques Dutra <dutra.astro@gmail.com>
 */
public class DemographicGrowth {

    public static void main(String[] args) {

        int populationTotalAvg = 7694180;//000;
        int doubled = 2 * populationTotalAvg;
        
        double taxGrowthPerYear = 1.2 / 100;

        System.out.println("Demographic Growth show");
        System.out.println("===========================================");

        int counter = 1;
        int thisYear = 2019;
        int growthThisYear = (int)(populationTotalAvg * taxGrowthPerYear);
        int doubledPopYear = 0;
        
        System.out.printf("#\tYear\tExpected Popul.\tAmount\n");
        System.out.println("------------------------------------");
        System.out.printf("0\t%d\t%d000\t%d000\n",thisYear, populationTotalAvg, growthThisYear);
        
        while (counter < 76) {
            growthThisYear = (int)(populationTotalAvg * taxGrowthPerYear);
            populationTotalAvg += growthThisYear;
            System.out.printf("%d\t%d\t%d000\t%d000\n",counter,++thisYear, populationTotalAvg, growthThisYear);
            
            // verify if population has doubled
            if (populationTotalAvg >= doubled) {
                if (doubledPopYear == 0) {
                    doubledPopYear = thisYear;
                }
            }
            
            counter++;
        }
        
        System.out.println("Population doubled at: "+doubledPopYear);

    }
}
