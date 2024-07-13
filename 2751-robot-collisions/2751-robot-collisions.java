class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Integer[] indexes = new Integer[n];
        for(int i = 0 ; i < n ; i++)
            indexes[i] = i;
        
        Arrays.sort(indexes , new Comparator<Integer>(){
            public int compare(Integer a , Integer b){
                return positions[a] - positions[b];
            }
        });

        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for(int index : indexes){
            if(directions.charAt(index) == 'R'){
                stack.push(index);
            }
            else{
                boolean isSurvived = true;
                while(!stack.isEmpty()){
                    int topIndex = stack.peek();
                    
                    if(directions.charAt(topIndex) == 'L'){
                        isSurvived = true;
                        break;
                    }
                    else if(healths[index] > healths[topIndex]){
                        healths[topIndex] = 0;
                        healths[index] -= 1;
                        isSurvived = true;
                        stack.pop();
                    }
                    else if(healths[topIndex] > healths[index]){
                        healths[index] = 0;
                        healths[topIndex] -= 1;
                        isSurvived = false;
                        break;
                    }
                    else{
                        healths[index] = 0;
                        healths[topIndex] = 0;
                        isSurvived = false;
                        stack.pop();
                        break;
                    }

                }
                if(isSurvived){
                    stack.push(index);
                }
            }
        }

        for(int i = 0 ; i < n ; i++){
            if(healths[i] > 0)
                result.add(healths[i]);
        }

        return result;

    }
}