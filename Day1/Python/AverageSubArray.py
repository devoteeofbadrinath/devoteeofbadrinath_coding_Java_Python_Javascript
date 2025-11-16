class AverageSubArray:
    def averageSubArray(self, input, l):
        for i in range(0,len(input)-l+1):
            sum = 0
            for j in range(0,l):
                sum  = sum + input[i+j]
            print(sum)


averageSubArray = AverageSubArray()
averageSubArray.averageSubArray([-1], 1)
