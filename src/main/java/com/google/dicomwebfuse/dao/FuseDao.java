// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.dicomwebfuse.dao;

import com.google.dicomwebfuse.exception.DicomFuseException;
import com.google.dicomwebfuse.dao.spec.QueryBuilder;
import com.google.dicomwebfuse.entities.DicomStore;
import com.google.dicomwebfuse.entities.Instance;
import com.google.dicomwebfuse.entities.Series;
import com.google.dicomwebfuse.entities.Study;
import java.util.List;

public interface FuseDao {

  List<DicomStore> getDicomStoresList(QueryBuilder queryBuilder) throws DicomFuseException;
  List<Study> getStudiesList(QueryBuilder queryBuilder) throws DicomFuseException;
  List<Series> getSeriesList(QueryBuilder queryBuilder) throws DicomFuseException;
  List<Instance> getInstancesList(QueryBuilder queryBuilder) throws DicomFuseException;

  void downloadInstanceToTempFile(QueryBuilder queryBuilder) throws DicomFuseException;
  void uploadInstance(QueryBuilder queryBuilder) throws DicomFuseException;
  void deleteInstance(QueryBuilder queryBuilder) throws DicomFuseException;
}
