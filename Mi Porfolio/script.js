// Selecciona todas las imágenes de la galería y el modal
const images = document.querySelectorAll('.gallery-image');
const modal = document.getElementById('modal');
const modalImg = document.getElementById('modal-img');
const closeModal = document.querySelector('.close');

// Muestra la imagen en el modal al hacer clic en una miniatura
images.forEach(image => {
  image.addEventListener('click', () => {
    modal.style.display = 'flex'; // Muestra el modal
    modalImg.src = image.src.replace('-thumb', ''); // Reemplaza el sufijo '-thumb' para obtener la imagen grande
  });
});

// Cierra el modal al hacer clic en la "X"
closeModal.addEventListener('click', () => {
  modal.style.display = 'none';
});

// Cierra el modal al hacer clic fuera de la imagen ampliada
modal.addEventListener('click', (e) => {
  if (e.target === modal) {
    modal.style.display = 'none';
  }
});