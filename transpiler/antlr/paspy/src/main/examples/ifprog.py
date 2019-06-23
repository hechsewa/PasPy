def ifprog():
	number = 50
	print('If this was a grade, you would receive a grade of:  ')
	if number >= 90:
		print('A')
	elif number >= 80:
		print('B')
	elif number >= 70:
		print('C')
	elif number >= 60:
		print('D')
	else:
		print('F')

	print()


if __name__ == "__main__":
	ifprog()