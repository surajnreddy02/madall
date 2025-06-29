private fun showDatePicker() {
    val datePickerDialog = DatePickerDialog(
        this,
        { _, year, month, day ->
            calendar.set(year, month, day)
            val date = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(calendar.time)
            // Show Toast instead of updating TextView
            Toast.makeText(this, "Selected Date: $date", Toast.LENGTH_SHORT).show()
        },
        calendar.get(Calendar.YEAR),
        calendar.get(Calendar.MONTH),
        calendar.get(Calendar.DAY_OF_MONTH)
    )
    datePickerDialog.show()
}