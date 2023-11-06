const trigger = document.querySelector(".dropdown-toggle");
trigger.addEventListener("click", function() {
  const dropdown = document.querySelector(".dropdown-menu");
    dropdown.classList.toggle("show");
});