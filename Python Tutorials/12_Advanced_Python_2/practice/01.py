# create 2 venv , install few packages in one. Create a similar env in the 2nd one
''' 
python -m venv env1
python -m venv env2
.\env1\Scripts\activate
pip install pandas
pip install pyjokes
pip freeze > requirements.txt
pip freeze > requirements.txt
deactivate
.\env2\Scripts\activate
pip install -r .\requirements.txt
pip freeze --- to check

# to save diff req files for both the envs: 
# inside env1
pip freeze > requirements_env1.txt

# inside env2
pip freeze > requirements_env2.txt



'''