class MySort implements Comparator<Interval>{
     public int compare(Interval a, Interval b){
         
        return (a.start - b.start);
     }
 }
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        
        Collections.sort(intervals, new MySort());
        ArrayList<Interval> ans = new ArrayList<>();
        int counter =0;
        int si = intervals.get(0).start;
        int ei = intervals.get(0).end;
        while(counter < intervals.size()){
            if(ei >= intervals.get(counter).start){
                ei = Math.max(ei, intervals.get(counter).end);
            }
            else{
                Interval temp = new Interval(si,ei);
                ans.add(temp);
                si= intervals.get(counter).start;
                ei= intervals.get(counter).end;
            }
            counter++;
        }
        Interval temp = new Interval(si,ei);
        ans.add(temp);
        return ans;
        
        
    }
}
