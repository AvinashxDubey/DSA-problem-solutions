public class gasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0, net =0, total=0;
        for(int i=0; i<gas.length; i++){
            net+= gas[i]-cost[i];
            total+= gas[i]-cost[i];
            if(total<0){
                total=0;
                start = i+1;
            }
        }
        return net < 0 ? -1 : start;
    }
}

