def factorial(num):
    if num > 1:
        num = num * factorial(num - 1)
        return num
    else:
        return 1

factorial(3)

