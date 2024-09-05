package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        if(first > second & first > third){
            return first;
        }
        else if(second > first & second > third){
            return second;
        }
        else if(third > first & third > second){
            return third;
        }
        else{
            throw new IllegalArgumentException();
        }
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        return originalPrice - (originalPrice * discountPercent) + (originalPrice * salesTax);
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        if(yearsOld > 1 & daysSinceShoesChewed > 3 & fetchedThePaperToday == true){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        if (numbers == null || numbers.isEmpty()) {
            return -1;
        }
        int largest = numbers.get(0);
        int index = 0;
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > largest) {
                largest = numbers.get(i);
                index = i;
            }
        }
        return index;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        if (numbers == null || numbers.isEmpty()) {
            return -1;
        }
        int largest = numbers.get(0);
        int index = 0;
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) >= largest) {
                largest = numbers.get(i);
                index = i;
            }
        }
        return index;
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        String resultWord = null;
        int maxCount = 0;
        if(words == null || words.isEmpty()){
            throw new IllegalArgumentException();
        }
        
        for (String word : words) {
            int currentCount = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == letter) {
                    currentCount++;
                }
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                resultWord = word;
            }
        }

        return resultWord;
    }


}
