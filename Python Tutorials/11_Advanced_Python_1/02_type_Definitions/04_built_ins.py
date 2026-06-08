#  Python 3.10+ — no need to import Union, use | instead
def show(x: int | str) -> None:
    print(x)
show(20)
show("Raghav")
    
# Python 3.9+ — no need to import List/Dict, use built-ins directly , modern Python uses lowercase directly 

scores: list[int] = [90, 85, 78]
data: dict[str, int] = {"age": 20}