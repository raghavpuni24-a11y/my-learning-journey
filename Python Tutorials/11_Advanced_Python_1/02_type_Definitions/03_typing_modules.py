# Type hints are just hints — not strict rules at runtime -- if you violate their allowed data type , there will be no error -- they are introduced just to increase readability and warn to override something to prevent its original value


from typing import List, Tuple, Dict, Union
# one data type for all
marks : List[int] = [55,67,90,45]
breeds : Tuple[str] =("labrador","dalmation","bulldog","corgy")
# multiple data type
person : Tuple[str,int] = ("Raghav",20)
data : Dict[str,int]= {"Raghav":20,"Prince":22}
# Union - multiple data type allowed
id: Union[int,str]="TR45O"
id=4567  # accept int or str

