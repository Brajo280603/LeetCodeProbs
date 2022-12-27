/**
 * @param {number[]} nums
 * @return {number[]}
 */
var buildArray = function(nums) {
  let arr = [];
  for(let i = 0;i<nums.length;i++){
    arr[i]=nums[nums[i]];
  }
  return arr;
};

let arrout = buildArray([0,2,1,5,3,4]);
console.log(arrout);
