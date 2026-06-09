# python -m venv __name_of_the_venv_folder__  -- to create a venv 

# ACTIVATING VENV:
# Windows:  .\venv_name\Scripts\activate
# Mac/Linux: source venv_name/bin/activate

# DEACTIVATING:
# deactivate  (works on all OS)

# pip freeze -- shows all installed packages in current active venv
# pip freeze > requirements.txt -- saves them to a file
# OR 
# pip freeze command - to show all the installed packages in the current active venv
# pip freeze > requirements.txt  -- creates a requirements.txt file showing all the installed actice packages

# RECREATING ENV FROM requirements.txt:
# python -m venv newenv
# .\newenv\Scripts\activate
# pip install -r requirements.txt

# BEST PRACTICE:
# Always create venv OUTSIDE OneDrive/project folder (e.g. C:\venvs\)
# Always add venv folder to .gitignore
# Never commit venv -- only commit requirements.txt

# to save different req files for both envs:
# inside env1 --> pip freeze > requirements_env1.txt
# inside env2 --> pip freeze > requirements_env2.txt