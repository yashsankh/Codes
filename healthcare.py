
# Importing necessary libraries
import random

# Defining symptoms and their possible causes
symptoms = {
  "fever": ["cold", "flu", "pneumonia"],
  "cough": ["cold", "flu", "pneumonia"],
  "headache": ["migraine", "sinusitis", "tension headache"],
  "nausea": ["food poisoning", "migraine", "stomach flu"],
  "fatigue": ["anemia", "depression", "mononucleosis"]
}

# Defining the expert system function
def expert_system():
  print("Welcome to the Healthcare Expert System!\n")
  print("Please answer the following questions with Yes or No.\n")

  # Looping through all symptoms to ask the user if they are experiencing them
  for symptom in symptoms:
    answer = input(f"Are you experiencing {symptom}? ")
    if answer.lower() == "yes":
      print(f"Possible causes for {symptom} include: {', '.join(symptoms[symptom])}\n")
    
  # Determining a likely diagnosis based on the symptoms entered
  diagnosis = ""
  possible_diagnoses = set()
  for symptom in symptoms:
    answer = input(f"Are you still experiencing {symptom}? ")
    if answer.lower() == "yes":
      for possible_diagnosis in symptoms[symptom]:
        possible_diagnoses.add(possible_diagnosis)
  
  # Outputting the likely diagnosis or suggesting a visit to a healthcare professional
  if len(possible_diagnoses) == 1:
    diagnosis = possible_diagnoses.pop()
    print(f"\nBased on your symptoms, you likely have {diagnosis}. Please visit a healthcare professional for further advice.\n")
  elif len(possible_diagnoses) > 1:
    print(f"\nBased on your symptoms, you may have one of the following conditions: {', '.join(possible_diagnoses)}. Please visit a healthcare professional for further advice.\n")
  else:
    print("\nBased on your symptoms, we could not determine a likely diagnosis. Please visit a healthcare professional for further advice.\n")
    
# Running the expert system
expert_system()