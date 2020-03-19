package com.soundai.threemonths.topic14;

import io.netty.channel.ChannelFuture;

/**
 * @author: liujialei
 * @create: 2020-01-04 11:54
 **/
public class Solution {

    /**
     * 给你一根长度为n的绳子，请把绳子剪成m段（m、n都是整数，n>1,m>1），
     * 每段绳子的长度记为 k[0], k[1], k[2], …, k[m]。
     * 请问 k[0] * k[1] * k[2] * … * k[m] 可能的最大乘积是多少？
     * 例如，当绳子的长度为8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
     * ————————————————
     * dp[i]，这个状态就是题目中要我们求的。把整数 i 至少分割成  2个部分，各个部分都大于 0，它们的乘积。
     *
     * 状态转移方程：用 j 遍历 1，2，…, i -1 ，要么分割成两部分：i - j 和 j，要么是 j 和 dp[i-j]，取最大者。
     *
     * 作者：李威威
     * 链接：https://www.jianshu.com/p/ec6a453ee50f
     * 来源：简书
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    private int count (int n) {
        //dp 表示长度为
        int m = n - 1;
        int[] dp = new int[m];

        //dp[2] = //表示剪成两段时候的最大值，
        //状态转译方程 dp[m] = k[m] * k[n - m]

        return n;
    }

    /**
     * 分析问题的时候，很容易就可以得出这个问题的递归式：
     * 记长度为n的最大乘积为f(n)，易知f(n)=max{ f(i)*f(n-i) }，
     * 其中0<i<n。但是递归求解过程中，有很多子问题会重复求解，效率不高。
     * 这种子问题重叠较多的递归式，适合采用动态规划的方式求解。这儿就是使用自底向上的方式求解问题的，
     * 采用额外的存储空间，记录子问题的解，后续就可以直接使用，提高时间效率。动态规划实际上就是用空间效率换区时间效率的一种做法。
     *
     * @param len
     * @return
     */
    public static int maxProductAfterCutting(int len){
        if(len<2)
            return 0;
        if(len==2)
            return 1;
        if(len==3)
            return 2;
        //存储长度从 0-len 的最大结果
        int[] result=new int[len+1];
        result[0]=0;
        result[1]=1;
        result[2]=2;
        result[3]=3;

        //自底向上开始求解
        int max=0;
        for(int i=4;i<=len;i++){
            max=0;
            for(int j=1;j<=i/2;j++){
                int tempResult=result[j]*result[i-j];
                if(max<tempResult)
                    max=tempResult;
                result[i]=max;
            }
        }
        max=result[len];
        return max;
    }


}
