# Python — identical behavior
def divide(a, b):
    if b == 0:
        raise ZeroDivisionError("Can't divide!")  # stops here
    return a / b  # never reached if b==0

try:
    divide(10, 0) # function caller has  try-except so raise doesn't crash here
except ZeroDivisionError as e:
    print(f"Caught! {e}")  # catches it