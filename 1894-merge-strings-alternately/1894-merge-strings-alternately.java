class Solution {
    public String mergeAlternately(String word1, String word2) {

        List<String> word1Array = split(word1);
        List<String> word2Array = split(word2);

        return mergeLists(word1Array, word2Array);
    };

    private List<String> split(String word) {
        String[] wordArray = word.replaceAll(" ", "").split("");
        return Arrays.asList(wordArray);
    }

    private String mergeLists(List<String> list1, List<String>list2) {
        int list1Size = list1.size();
        int list2Size = list2.size();
                StringBuilder result = new StringBuilder();
        if(list1Size >= list2Size) {
            for(int i = 0; i < list2Size; i ++) {
                result.append(list1.get(i)).append(list2.get(i));
            }
            String endString = String.join("", list1.subList(list2Size, list1Size));
            result.append(endString);
            return result.toString();
        }
        for(int i = 0; i < list1Size; i ++) {
            result.append(list1.get(i)).append(list2.get(i));
        }
        String endString = String.join("", list2.subList(list1Size, list2Size));
        result.append(endString);
        return result.toString();

    }

}