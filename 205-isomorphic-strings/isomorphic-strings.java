class Solution {
    public boolean isIsomorphic(String s, String t) {
          if(s.length()!=t.length()){
            return false;
          }
          HashMap<Character,Character>map=new HashMap<>();
          HashMap<Character,Character>rmap=new HashMap<>();
          for(int i=0;i<s.length();i++){
        char a=s.charAt(i);
        char b=t.charAt(i);

        if(map.containsKey(a) && map.get(a)!=b){
            return false;
        }

        if(rmap.containsKey(b) && rmap.get(b)!=a){
            return false;
        }

        map.put(a,b);
        rmap.put(b,a);
          }
          return true;
    }
}