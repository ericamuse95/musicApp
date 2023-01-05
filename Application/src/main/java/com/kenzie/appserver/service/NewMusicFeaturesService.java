package com.kenzie.appserver.service;


import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NewMusicFeaturesService {

    private NewMusicFeaturesRepository newMusicFeaturesRepository;
    private NewMusicFeatures SongId;

    public NewMusicFeaturesService(NewMusicFeaturesRepository newMusicFeaturesRepository) {
        this.newMusicFeaturesRepository = newMusicFeaturesRepository;
    }

    public <NewMusicFeatures> NewMusicFeaturesService(Object newMusicFeaturesRepository) {

    }

    public NewMusicFeatures findByFeatureId(String id) {
        NewMusicFeatures newMusicFeaturesFromBackend = newMusicFeaturesRepository
                .findByfeatureId(id)
                .map(newMusicFeatures -> {
                    NewMusicFeatures musicFeatures = new NewMusicFeatures();
                    return musicFeatures;
                })
                .orElse(null);

        return newMusicFeaturesFromBackend;
    }

    public NewMusicFeatures SongId(String id) {
        NewMusicFeatures newMusicFeaturesFromBackend = newMusicFeaturesRepository
                .findBySongId(id)
                .map(newMusicFeatures -> {
                    NewMusicFeatures musicFeatures = new NewMusicFeatures();
                    return musicFeatures;
                })
                .orElse(null);

        return SongId;
    }

    public NewMusicFeatures addNewNewMusicFeatures(NewMusicFeatures newMusicFeatures) {
        NewMusicFeaturesRecord newMusicFeaturesRecord = new NewMusicFeaturesRecord();
        newMusicFeaturesRecord.setFeatureId(newMusicFeatures.getFeatureId());
        newMusicFeaturesRecord.setFeatureId(newMusicFeatures.getFeatureId());
        newMusicFeaturesRepository.save(newMusicFeaturesRecord);
        return newMusicFeatures;
    }

    public Object findBySongId(String id) {
        return SongId(id);
    }

    class NewMusicFeatures {
        private Object NewMusicFeatures;

        public Object getFeatureId() {
            return NewMusicFeatures;
        }
    }

    private class NewMusicFeaturesRecord {
        public void setFeatureId(Object featureId) {
        }
    }

    private class NewMusicFeaturesRepository {
        public NewMusicFeatures find;

        public void save(NewMusicFeaturesRecord newMusicFeaturesRecord) {

        }

        public Optional<Object> findByfeatureId(String id) {
            return newMusicFeaturesRepository.findByfeatureId(id);
        }

        public Optional<Object> findBySongId(String id) {
            return Optional.ofNullable(SongId(id));
        }
    }
}

