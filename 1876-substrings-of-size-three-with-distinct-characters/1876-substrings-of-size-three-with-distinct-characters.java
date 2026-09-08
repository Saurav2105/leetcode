class Solution {
    public int countGoodSubstrings(String s) {
      Set<Character>set=new HashSet<>();
      int left=0,count=0;
      for(int i=0;i<s.length();i++){
        while(set.contains(s.charAt(i))){
            set.remove(s.charAt(left));
            left++;
        }
        set.add(s.charAt(i));
        if(set.size()==3){
            count++;
            set.remove(s.charAt(left));
            left++;
        }
      } 
      return count;
    }
}