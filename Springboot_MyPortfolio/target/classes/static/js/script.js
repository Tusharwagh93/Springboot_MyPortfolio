document.addEventListener("DOMContentLoaded", () => {
  console.log("Portfolio loaded successfully!");

  // Animate sections on scroll
  const sections = document.querySelectorAll("section");

  const revealOnScroll = () => {
    const triggerBottom = window.innerHeight * 0.85;
    sections.forEach(section => {
      const sectionTop = section.getBoundingClientRect().top;
      if (sectionTop < triggerBottom) {
        section.classList.add("visible");
      }
    });
  };

  window.addEventListener("scroll", revealOnScroll);
  revealOnScroll(); // Initial call

  // Typewriter Looping Effect
  const typewriter = document.querySelector(".typewriter-text");
  const text = "Hi, I'm Tushar";
  let index = 0;
  let isDeleting = false;

  const type = () => {
    if (isDeleting) {
      typewriter.textContent = text.substring(0, index--);
    } else {
      typewriter.textContent = text.substring(0, index++);
    }

    if (!isDeleting && index === text.length + 1) {
      setTimeout(() => isDeleting = true, 1000);
    } else if (isDeleting && index === 0) {
      isDeleting = false;
    }

    setTimeout(type, isDeleting ? 80 : 120);
  };

  if (typewriter) {
    type();
  }

  // Navbar Active Link on Scroll
  const navLinks = document.querySelectorAll("nav ul li a");

  window.addEventListener("scroll", () => {
    let current = "";

    sections.forEach(section => {
      const sectionTop = section.offsetTop;
      if (pageYOffset >= sectionTop - 80) {
        current = section.getAttribute("id");
      }
    });

    navLinks.forEach(link => {
      link.classList.remove("active");
      if (link.getAttribute("href") === `#${current}`) {
        link.classList.add("active");
      }
    });
  });
});
