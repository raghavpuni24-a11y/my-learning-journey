import pyttsx3
engine=pyttsx3.init() # Starts the TTS engine and returns an engine object.
engine.say("Hey!My name is Raghav Parashar and I am a 2nd year AI & DS student  ")
# Queues the text to be spoken. Note — it doesn't speak yet, just adds it to a queue.
engine.runAndWait()# NOW it actually speaks — processes the queue and waits till it finishes before moving to next line.