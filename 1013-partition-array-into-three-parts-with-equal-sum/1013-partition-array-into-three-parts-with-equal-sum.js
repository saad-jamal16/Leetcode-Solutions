/**
 * @param {number[]} arr
 * @return {boolean}
 */
var canThreePartsEqualSum = function(A) {
    let totalSum=0;
    for(let i=0; i<A.length;i++){
        totalSum+=A[i]
    }
    const average = totalSum/3;
    let sum=0,count=0;
    for(let i=0;i<A.length;i++){
        sum+=A[i];
        if(sum===average){
            count++;
            sum=0;
        }
    }
    return count>=3;

};