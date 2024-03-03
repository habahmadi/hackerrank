if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores

    query_name = input()

    # Check if query_name exists in the dictionary
    if query_name in student_marks:
        # Calculate the average for the specific student
        average = sum(student_marks[query_name]) / len(student_marks[query_name])
        
        # Print the average with 2 decimal places
        print("{:.2f}".format(average))
    else:
        print("Student not found")