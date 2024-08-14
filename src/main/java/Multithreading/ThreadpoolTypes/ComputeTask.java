package Multithreading.ThreadpoolTypes;

import java.util.concurrent.RecursiveTask;

/**
 * Author : Rajdeep Deb
 * Date   : 14-08-2024
 * Time   : 01:01 AM
 */
public class ComputeTask extends RecursiveTask<Integer> {

    int start,end;

    public ComputeTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {

        if(end-start<=4){
            int totalSum=0;
            for(int i=start;i<=end;i++)totalSum+=i;
            return  totalSum;
        }else{

            int mid=(start+end)>>1;
            ComputeTask leftTask=new ComputeTask(start,mid);
            ComputeTask rightTask=new ComputeTask(mid+1,end);

            leftTask.fork();
            rightTask.fork();

            int leftRes=leftTask.join();
            int rightRes=rightTask.join();
            return leftRes+rightRes;
        }
    }
}
