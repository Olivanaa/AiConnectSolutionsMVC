package br.com.fiap.connectionsolutions_ia.feedback;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FeedbackService {

    FeedbackRepository feedbackRepository;

    public Feedback criar(@Valid Feedback feedback){
        return feedbackRepository.save(feedback);
    }

    public List<Feedback> buscarTodos(){
        return feedbackRepository.findAll();
    }

    public Feedback buscarPorId(Long id){
        return feedbackRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Feedback não encontrado")
        );
    }

    public void deletar(Long id){
        verificarFeedback(id);
        feedbackRepository.deleteById(id);
    }

    public Feedback atualizar(Long id, Feedback feedback){
        verificarFeedback(id);
        feedback.setId(id);
        return feedbackRepository.save(feedback);
    }

    private void verificarFeedback(Long id) {
        feedbackRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Feedback com id " + id + "não encontrado")
        );
    }
}
