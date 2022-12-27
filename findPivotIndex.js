/**
 * @param {number[]} nums
 * @return {number}
 */
var pivotIndex = function(nums) {
 let index = 0;
    let leftsum = 0;
    let rightsum = 0;

    

    function loop( start, end, obj){
        let tempNum = 0;
        for(let i = start;i<end;i++){
           tempNum+= obj[i];
        }
        console.log(tempNum);
        return tempNum
    }

    for(let i =0;i<nums.length;i++){
        if(loop(0,i,nums) == loop(i+1,nums.length,nums)){
            return i
        }
        
    }
    return -1;
};
