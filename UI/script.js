// Material Select Initializatio
document.multiselect('#testSelect1')
  .setCheckBoxClick("checkboxAll", function(target, args) {
    console.log("Checkbox 'Select All' was clicked and got value ", args.checked);
  })
  .setCheckBoxClick("1", function(target, args) {
    console.log("Checkbox for item with value '1' was clicked and got value ", args.checked);
  });
