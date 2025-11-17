class AverageSubArray:
    def averageSubArray(self, input, l):
        sum = 0
        for i in range(0,len(input)):
            if i<l:
                sum = sum + input[i]
                continue
            else:
                #max = sum
                sum = sum + input[i] - input[i-l]
            print(sum)


averageSubArray = AverageSubArray()
averageSubArray.averageSubArray([-1,-2,-3,-4], 1)
