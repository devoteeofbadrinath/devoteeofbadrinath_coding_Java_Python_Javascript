class AverageSubArray:
    def averageSubArray(c, inputArray, length):
        for i in range(0, len(inputArray) - length + 1):
            sum = 0
            for j in range(0, length):
                sum = sum + inputArray[i+j]
            print("sum = ", sum)
averageSubArray = AverageSubArray()
averageSubArray.averageSubArray([-1, 22, -3, 4, -5] ,0)

